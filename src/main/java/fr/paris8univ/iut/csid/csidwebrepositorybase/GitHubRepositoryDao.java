package fr.paris8univ.iut.csid.csidwebrepositorybase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;



@Component
public class GitHubRepositoryDao {
	
	private final RestTemplate restTemplate;
	
	@Autowired
	public GitHubRepositoryDao(RestTemplateBuilder restTemplate) {
		this.restTemplate=restTemplate.build();
	}
	
	public GitRepositoryDTO getGitInfo(String repositoy,String owner) throws RestClientException, URISyntaxException{
		return restTemplate.getForEntity(new URI("https://api.github.com/repos/"+owner+"/"+repositoy),GitRepositoryDTO.class).getBody();
	}
	
	public IssueReturned createIssue(String repository,String owner, String token, Issue issue) throws RestClientException, URISyntaxException {
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(token);
		HttpEntity<Issue> entity = new HttpEntity<>(issue, headers);
		return restTemplate.exchange(new URI("https://api.github.com/repos/"+owner+"/"+repository+"/issues"), HttpMethod.POST ,entity, IssueReturned.class).getBody();
	}
	
	public List<IssueReturned> getIssues(String repository,String owner) throws RestClientException, URISyntaxException {
		IssueReturned[] response = restTemplate.getForEntity(new URI("https://api.github.com/repos/"+owner+"/"+repository+"/issues"), IssueReturned[].class).getBody();
		return Arrays.asList(response);
	}
}
