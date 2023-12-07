package sg.edu.nus.iss.day19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day19Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day19Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String pathFileName = "C:/Users/Huawei/day19/src/main/resources/employees.json";
		
		File file = new File(pathFileName);
		InputStream is = new FileInputStream(file);

		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			String line = "";
			while((line = br.readLine()) != null) {
				resultStringBuilder.append(line);
			}
		}

		String data = resultStringBuilder.toString();
		System.out.println(data);
	}

}
