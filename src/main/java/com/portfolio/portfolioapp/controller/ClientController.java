package com.portfolio.portfolioapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.portfolio.portfolioapp.entity.Client;
import com.portfolio.portfolioapp.service.ClientService;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public String viewClientList(Model model) {
        model.addAttribute("clients", clientService.listAll());
        return "client-list";
    }

    @GetMapping("/clients/new")
    public String showNewClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "client-form";
    }

    @PostMapping("/clients/save")
    public String saveClient(@ModelAttribute("client") Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }
}
