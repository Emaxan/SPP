///////////////////////////////////////////////////////////
//  UserController.cs
//  Implementation of the Class UserController
//  Generated by Enterprise Architect
//  Created on:      11-Nov-2017 8:55:21 AM
//  Original author: Max Ermoshyn
///////////////////////////////////////////////////////////

using System.Collections.Generic;
using System.Web.Mvc;
using OOP.Models;
using OOP.Services;

namespace OOP.Controllers
{
    public class UserController : Controller
    {
        public UserRepository m_UserRepository;

        /// <param name="user"></param>
        public void SignIn(User user)
        {
        }

        /// <param name="id"></param>
        public User GetUser(int id)
        {
            return null;
        }

        public List<User> Index()
        {
            return null;
        }

        /// <param name="user"></param>
        public void SignOut(User user)
        {
        }
    } //end UserController
} //end namespace View
