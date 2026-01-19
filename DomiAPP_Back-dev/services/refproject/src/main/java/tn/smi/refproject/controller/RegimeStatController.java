package tn.smi.refproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.smi.refproject.entities.RegimeStatEntity;
import tn.smi.refproject.services.Interface.IRegimeStatService;

import java.util.List;
import java.util.Locale;

@AllArgsConstructor
@RestController
    @RequestMapping("/api/v1/ref/RegimeStat")
public class RegimeStatController {
    private IRegimeStatService iRegimeStatService;
@GetMapping("/get/{id}")
    public RegimeStatEntity getRegimeStatById(@PathVariable Short id) {
        return iRegimeStatService.getRegimeStatById(id);
    }
@GetMapping("/all")
    public List<RegimeStatEntity> getRegimeStats() {
        return iRegimeStatService.getRegimeStats();
    }
    @GetMapping("/allcoderegimestat")

    public List<Long> getAllCodeRegimeStat() {
        return iRegimeStatService.getAllCodeRegimeStat();
    }
}
