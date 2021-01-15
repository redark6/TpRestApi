package fr.paris8univ.iut.csid.csidwebrepositorybase;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StatRepository {
	
	private final StatDao statDao;
	@Autowired
	public StatRepository(StatDao statDao) {
		this.statDao=statDao;
	}
	
	public  List<Stat> GetStat(String nameRepo,String statType) {
		return statDao.findAllStatForNameOrderByDate(nameRepo, statType).stream()
		.map(x-> new Stat(x.getId(),x.getName(),x.getEntry_type(),x.getCreationDate(),x.getValue()))
		.collect(Collectors.toList());
		
	}
}
