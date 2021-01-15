package fr.paris8univ.iut.csid.csidwebrepositorybase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatService {

	private final StatRepository statRepository;
	
	@Autowired
	public StatService(StatRepository statRepository) {
		this.statRepository=statRepository;
	}
	
	public List<Stat> GetStat(String nameRepo,String statType) {
		return statRepository.GetStat(nameRepo, statType);
	}
	
}
