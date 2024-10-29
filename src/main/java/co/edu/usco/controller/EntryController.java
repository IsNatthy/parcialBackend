package co.edu.usco.controller;

import co.edu.usco.entity.VehicleTypeEntity;
import co.edu.usco.entity.EntryEntity;
import co.edu.usco.service.EntryService;
import co.edu.usco.service.VehicleTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class EntryController {

    private final EntryService entryService;
    private final VehicleTypeService vehicleTypeService;

    @GetMapping({"entries", "/"})
    public String getAllEntries(Model model) {
        model.addAttribute("entries", entryService.getAllEntries());
        return "entries";
    }

    @GetMapping("entries/{id}")
    public String getEntry(Model model, @PathVariable Long id) {
        model.addAttribute("entry", entryService.getEntryById(id));
        return "entry_form";
    }

    @GetMapping("entries/new")
    public String addEntry(Model model) {
        model.addAttribute("vehicleType", vehicleTypeService.getAllTypes());
        model.addAttribute("entry", new EntryEntity());
        return "entry_form";
    }

    @PostMapping("entries")
    public String addEntry(@ModelAttribute EntryEntity entry) {
        entryService.createEntry(entry);
        return "redirect:/entries";
    }

    @GetMapping("entries/edit/{id}")
    public String updateEntry(@PathVariable Long id, Model model) {
        model.addAttribute("vehicleType", vehicleTypeService.getAllTypes());
        model.addAttribute("entry", entryService.getEntryById(id));
        return "entry_update";
    }

    @PostMapping("entries/update/{id}")
    public String updateEntry(@PathVariable Long id, @ModelAttribute EntryEntity entry) {
        entryService.updateEntry(entry, id);
        return "redirect:/entries";
    }

    @GetMapping("entries/delete/{id}")
    public String deleteEntry(@PathVariable Long id) {
        entryService.deleteEntryById(id);
        return "redirect:/entries";
    }
}
