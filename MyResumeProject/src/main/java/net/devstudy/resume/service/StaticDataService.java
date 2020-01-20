package net.devstudy.resume.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import net.devstudy.resume.domain.Hobby;
import net.devstudy.resume.model.LanguageLevel;
import net.devstudy.resume.model.LanguageType;

public interface StaticDataService {

	@Nonnull Set<Hobby> findAllHobbies();
	
	@Nonnull List<Hobby> createHobbyEntitiesByNames(@Nonnull List<String> names);
	
	@Nonnull Map<Integer, String> findMonthMap();
	
	@Nonnull List<Integer> findPracticsYears();
	
	@Nonnull List<Integer> findCourcesYears();
	
	@Nonnull List<Integer> findEducationYears();
	
	@Nonnull Collection<LanguageType> findAllLanguageTypes(); 
	
	@Nonnull Collection<LanguageLevel> findAllLanguageLevels();
}
