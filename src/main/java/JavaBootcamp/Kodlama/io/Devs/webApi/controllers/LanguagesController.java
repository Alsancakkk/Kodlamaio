package JavaBootcamp.Kodlama.io.Devs.webApi.controllers;

import JavaBootcamp.Kodlama.io.Devs.business.abstracts.LanguagesService;
import JavaBootcamp.Kodlama.io.Devs.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguagesService languagesService;

    @Autowired
    public LanguagesController(LanguagesService languagesService) {
        this.languagesService = languagesService;
    }

    @GetMapping("/getall")
    public List<Languages> getAll() {
        return languagesService.getAll();
    }
    @GetMapping("/{id}")
    public Languages findById(@PathVariable int id) {
        return languagesService.findById(id);
    }

    @PostMapping("/add")
    public Languages add(Languages languages) throws Exception {

        return languagesService.add(languages);
    }
    @DeleteMapping("/delete")
    public void deleteById(int id) {
        languagesService.deleteById(id);
    }
    @PutMapping("/{id}")
    public Languages save(@RequestBody Languages languages, @PathVariable int id) throws Exception  {
        Languages existingLanguage = languagesService.findById(id);
        existingLanguage.setName(languages.getName());
     return languagesService.save(existingLanguage);
    }

//    @PostMapping
//    public void add(@RequestBody Languages languages) throws Exception {
//        languagesService.add(languages);
//    }

//    @DeleteMapping("/{id}")
//    boolean delete(@PathVariable int id)  {
//        languagesService.delete(id);
//
//        return false;
//    }
}