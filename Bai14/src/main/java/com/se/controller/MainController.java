package com.se.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.se.entity.Book;
import com.se.service.BookService;
import com.se.service.BookServiceImpl;




@Controller
public class MainController {
	
	@Autowired
    private BookService bookservice;	
	
	
@RequestMapping("/listproduct")
public String test(Model theModel){
	List<Book> kq=bookservice.getBooks();
	
	theModel.addAttribute("books",kq);
return "list-product";	
}
@RequestMapping("/sort")
public String test2(Model theModel){
	List<Book> kq=bookservice.sortBooks();
	
	theModel.addAttribute("bookss",kq);
return "sort";	
}
@GetMapping("/delete")
public String deleteBook(@RequestParam("bookid") int id) {

  
        bookservice.deleteBook(id);

        return "redirect:/listproduct";
}
@GetMapping("/add")
public String addBook(Model model) {
model.addAttribute("book",new Book());
        return "add";
}


@RequestMapping(value = "/save", method = RequestMethod.POST)
public String saveBook(@ModelAttribute("book") Book book) {
	bookservice.addBook(book);
  return "redirect:/listproduct";
}

@RequestMapping(value = "/search")
public String searchBook(@RequestParam("searchString") String check,Model theModel) {

	List<Book> kq=bookservice.searchBooks(check);
	theModel.addAttribute("searchbooks",kq);
  return "search";
}

}
