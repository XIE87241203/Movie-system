package com.xie.controller.api;


import com.xie.model.ResultModel;
import com.xie.model.User;
import com.xie.service.IUserService;
import com.xie.tools.Tools;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/api/user")
public class UserApiController extends BaseApiController {

    @Resource
    private IUserService userService;

    /**
     * 登录接口
     *
     * @param userName 用户email
     * @param password base64 md5加密的密码
     * @return ResultModel
     */
    @RequestMapping("/login.do")
    public @ResponseBody
    ResultModel login(String userName, String password) {
        //参数判空
        ResultModel result = isEmpty(userName, password);
        if (result != null) return result;
        userName = userName.toLowerCase();
        User user = userService.selectUser(userName);
        if (user == null) {
            //判断用户是否存在
            result = getErrorResult("用户不存在");
        } else {
            if (password.equals(user.getPassword())) {
                try {
                    String token = Tools.getMD5Str(userName + password + System.currentTimeMillis());
                    userService.setToken(user.getId(), token);
                    result = getSuccessResult(token);
                } catch (Exception e) {
                    e.printStackTrace();
                    result = getErrorResult("校验失败");
                }
            }
        }
        return result;
    }

}
