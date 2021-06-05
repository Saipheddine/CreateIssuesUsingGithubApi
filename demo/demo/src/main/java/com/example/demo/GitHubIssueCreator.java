package com.example.demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


/**
 * This class represents the structure of the creator of issues on gitHub 
 * 
 * @author Seifeddine Bouhouch (SOE Projekt Gruppe 12)
 *
 */
@Component
public class GitHubIssueCreator {
	
	
	private @NonNull String repo;
	private @NonNull String user;
	
	

	public String getRepo() {
		return repo;
	}
	
	public void setRepo(String repo) {
		this.repo = repo;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	
//	public void createISsue(String issueTitle, String issueDesc) throws IOException {
//		//baseURL: "https://api.github.com/repos/"
//		String github_url = baseURL + user + "/" + repo + "/issues";
//		URL url = new URL(github_url);
//		HttpURLConnection http = (HttpURLConnection) url.openConnection();
//		String auth_token = "token " + properties.getPersonalAccessToken();
//		http.setRequestProperty("Authorization", auth_token);
//		http.setRequestMethod("POST");
//		http.setDoOutput(true);
//		http.setRequestProperty("Accept", "application/vnd.github.v3+json");
//		http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//
//		String data = "{\"title\":\"{issueTitle}\", \"body\": \"{issueDesc}\", \"label\": \"open\"}";
//
//		byte[] out = data.getBytes(StandardCharsets.UTF_8);
//
//		OutputStream stream = http.getOutputStream();
//		stream.write(out);
//		http.disconnect();
//	}
	
	
	public GitHubIssueDto createGitHubIssue(GitHubIssueDto gitHubIssueDto) {
		
//		ResponseEntity<GitHubIssueDto> response = rest.postForEntity(
//				"https://{address}:{port}/feedback",
//				request,
//				GitHubIssueDto.class,
//				properties.getNetAddress());
//			
//			log.trace("Submission Feedback - POST to GitHub is sent: {}", "testid");
//			var result = (GitHubIssueDto) response.getBody();
//			return result;
		RestTemplate result=new RestTemplate();
 
        String gitHub="https://{address}";
//       ResponseEntity <String> response = rest.postForEntity(
//               "https://authorization/: {token} {gitHub}",
//               gitHub,
//               String.class, token, gitHub );

       HttpHeaders headers = new HttpHeaders();
       headers.add(HttpHeaders.AUTHORIZATION, token );
       //headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
       TestObject wiou= new TestObject();

       HttpEntity<TestObject> request = new HttpEntity<TestObject>(wiou,headers);
       //System.out.println(request);
       System.out.println(rest.exchange(gitHub, HttpMethod.POST, request, String.class))
	}
	
	
	
	
	
}
