package com.isaia.rest.customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.spi.FileSystemProvider;

import org.apache.log4j.Logger;

public class CustomerHelloSayer {

	public void sayHello() {

		Logger logger = Logger.getLogger(this.getClass());

		InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("/resource.txt");

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(resourceAsStream));
		String line;
		try {
			while ((line = bufferedReader.readLine()) != null) {
				logger.info(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.info(resourceAsStream);

		FileSystemProvider.installedProviders().forEach(
				p -> logger.info(p.getScheme()));

		// try {
		// String content = new String(Files.readAllBytes(Paths.get(getClass()
		// .getResource("/resource.txt").toURI())));
		//
		// logger.info(content);
		//
		// } catch (IOException | URISyntaxException e) {
		// e.printStackTrace();
		// }

	}
}
