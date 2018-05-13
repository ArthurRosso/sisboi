package br.edu.ifrs.canoas.tcc.sisbov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifrs.canoas.tcc.sisbov.domain.Medicine;
import br.edu.ifrs.canoas.tcc.sisbov.repository.MedicineRepository;

@Controller
public class MedicineController {
	
	@Autowired
	private MedicineRepository mr;
	
	@RequestMapping("/showMedicines")
	public ModelAndView showMedicines(){
		ModelAndView mv = new ModelAndView("showMedicines");
		Iterable<Medicine> medicines = mr.findAll();
		mv.addObject("medicines", medicines);
		return mv;
	}
	
	@RequestMapping(value="/newMedicine", method=RequestMethod.GET)
	public String newMedicine (Model m) {
		
		m.addAttribute("medicine", new Medicine());
		
		return "newMedicine";
	}

	
	@RequestMapping(value="/newMedicine", method=RequestMethod.POST)
	public String newMedicine (Medicine medicine) {
		
		mr.save(medicine);
		
		return "redirect:/newMedicine";
	}

}
