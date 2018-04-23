package br.edu.ifrs.canoas.tcc.sisbov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
