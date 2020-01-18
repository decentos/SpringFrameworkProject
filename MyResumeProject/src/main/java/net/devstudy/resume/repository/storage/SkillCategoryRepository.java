package net.devstudy.resume.repository.storage;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.RepositoryDefinition;

import net.devstudy.resume.domain.SkillCategory;

@RepositoryDefinition(domainClass=SkillCategory.class, idClass=String.class)
public interface SkillCategoryRepository {

	List<SkillCategory> findAll(Sort sort);
}
