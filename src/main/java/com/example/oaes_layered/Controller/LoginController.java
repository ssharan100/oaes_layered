package com.example.oaes_layered.Controller;

import com.example.oaes_layered.Entity.Admin;
import com.example.oaes_layered.Entity.Author;
import com.example.oaes_layered.Service.AdminService;
import com.example.oaes_layered.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class LoginController
{
    @Autowired
    AuthorService authorService;

    @Autowired
    AdminService adminService;

    @RequestMapping(method = RequestMethod.POST, value = "/admin/login")
    public boolean loginAdmin(@RequestBody Admin admin) {
        return adminService.adminLogin(admin);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/admin/register")
    public boolean registerAdmin(@RequestBody Admin admin) {
        return adminService.registerAdmin(admin);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/admin/author/register")
    public boolean registerAuthor(@RequestBody Author author) {
        return adminService.registerAuthor(author);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/author/login")
    public int loginAuthor(@RequestBody Author author) {
        return authorService.authorLogin(author);
    }
}
