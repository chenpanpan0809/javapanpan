package ood.com.control;

import javax.servlet.http.HttpServletRequest;
import javax.swing.DefaultBoundedRangeModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

	
	
	
	
	
	/*public  void addUser(@Autowired HttpServletRequest request){*/
	@RequestMapping(value="/addUser")
	@ResponseBody
    public  Book addUser(@RequestBody Book book ){
    System.out.println(book.getBookName());
    System.out.println(book.getBookSize());
    System.out.println(book.getBookPrice());
    System.out.println(book.getBookPages());
    return book;
		
    }
	
}
