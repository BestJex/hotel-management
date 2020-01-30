package com.altersoftware.hotel.controller.impl;

import com.altersoftware.hotel.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.altersoftware.hotel.constant.TemplatePath;
import com.altersoftware.hotel.controller.FloorController;

/**
 * @author czy@win10
 * @date 2020/1/28 21:07
 */
@Controller
public class FloorControllerImpl implements FloorController {

    /**
     * 楼层信息页面
     *
     * @return
     */
    @Override
    @PostMapping("show-foller")
    public String showFlloor() { return TemplatePath.FLOOR; }

}