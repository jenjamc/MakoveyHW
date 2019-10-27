package com.controller;
import java.util.List;


import com.dao.HelWorldDAO;
import com.model.HelWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MainController {
    @Autowired
    private HelWorldDAO helWorldDAO;
    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        helWorldDAO.insertDepartment();
        helWorldDAO.insertDepartment();
        List<HelWorld> list = helWorldDAO.listDepartment();
        model.addAttribute("helworld", list);
        return "index";
    }
}
