package com.moviecount.controller;

import com.moviecount.entity.Person;
import com.moviecount.service.PersonService;
import com.moviecount.view.PersonTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(path="api/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/actors")
    public @ResponseBody
    List<String> getActorNconsts(@RequestParam Integer page_id){
        return personService.selActorNconstByPage(page_id);
    }

    @GetMapping("/actors/{nconst}")
    public @ResponseBody
    Person getActor(@PathVariable String nconst){
        return personService.selActorById(nconst);
    }

    @GetMapping("/directors")
    public @ResponseBody
    List<String> getDirectorNconsts(@RequestParam Integer page_id){
        return personService.selDirectorNconstByPage(page_id);
    }

    @GetMapping("/directors/{nconst}")
    public @ResponseBody
    Person getDirector(@PathVariable String nconst){
        return personService.selDirectorById(nconst);
    }

    @GetMapping("/actors/name")
    public @ResponseBody
    List<PersonTag> getActorByName(@RequestParam String name){
        if(name.isEmpty()) {
            return new LinkedList<PersonTag>();
        }
        List<Person> personList = personService.selActorByName(name);
        List<PersonTag> personTagList= new LinkedList<PersonTag>();
        for(Person person: personList){
            PersonTag personTag=new PersonTag();
            personTag.setValue(person.getNconst());
            personTag.setName(person.getName());
            personTagList.add(personTag);
        }
        return personTagList;

    }

    @GetMapping("/directors/name")
    public @ResponseBody
    List<PersonTag> getDirectorByName(@RequestParam String name){
        if(name.isEmpty()) {
            return new LinkedList<PersonTag>();
        }
        List<Person> personList = personService.selDirectorByName(name);
        List<PersonTag> personTagList= new LinkedList<PersonTag>();
        for(Person person: personList){
            PersonTag personTag=new PersonTag();
            personTag.setValue(person.getNconst());
            personTag.setName(person.getName());
            personTagList.add(personTag);
        }
        return personTagList;

    }

}
