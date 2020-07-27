package com.milu.javawebspringboot.web.admin;

import com.milu.javawebspringboot.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther Jack
 * @Date 2020/7/27
 */
@Controller
@RequestMapping("/admin")
public class TypeController {
    @Autowired
    private TypeService typeService;
    @RequestMapping("/types")
    public String Type(@PageableDefault(size =3,sort = {"id"},direction= Sort.Direction.DESC)
                       Pageable pageable, Model model)
    {   model.addAttribute("page",typeService.ListType(pageable));
        return "admin/types";
    }

}
