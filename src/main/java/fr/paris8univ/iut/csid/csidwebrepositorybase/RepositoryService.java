package fr.paris8univ.iut.csid.csidwebrepositorybase;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

@Service
public class RepositoryService {
	
	private final GitRepositoryRepository gitRepositoryRepository;
	
	//private final List<GitRepository> repositories = List.of(new GitRepository("test", "jule",5,5),
			//new GitRepository("machin", "jean",5,5));
	
	public RepositoryService(GitRepositoryRepository gitRepositoryRepository) {
		this.gitRepositoryRepository=gitRepositoryRepository;
	}
	
	public List<GitRepository> getRepositories(){
		return gitRepositoryRepository.getRepositories();
	}
	
	public Optional<GitRepository>  findOneRepository(String name) throws RestClientException, URISyntaxException{	
		return gitRepositoryRepository.findOneRepository(name);
	}
	
	public void creatRepository(GitRepository gitRepository){
		gitRepositoryRepository.creatRepository(gitRepository);
	}
	
	public void putRepository(String name,GitRepository gitRepository) {
		gitRepositoryRepository.putRepository(name, gitRepository);
	}
	
	public void patchRepository(String name, GitRepository gitRepository) {
		gitRepositoryRepository.patchRepository(name, gitRepository);
	}
	
	public void deleteRepository(String name) {
		gitRepositoryRepository.deleteRepository(name);
	}

}
