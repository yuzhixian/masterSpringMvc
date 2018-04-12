package masterSpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TwitterController {

//    @Autowired
//    private Twitter twitter;

//    @RequestMapping(value = "/")
//    public String home(){
//        return "searchPage";
//    }
//
//    @RequestMapping(value = "/Result")
//    public String hello(@RequestParam(defaultValue = "masterSpringMvc4")String search, Model model){
//        SearchResults searchResults = twitter.searchOperations().search(search);
//        List<String> tweets = searchResults.getTweets();
//        model.addAttribute("tweets",tweets);
//        model.addAttribute("search",search);
//        return "twitterPage";
//    }
}
