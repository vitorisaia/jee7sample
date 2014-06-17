package jee7sample;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class ResourceTest {

	@Test
	public void testResource() throws IOException, URISyntaxException {
		String content = new String(Files.readAllBytes(Paths.get(getClass()
				.getClassLoader().getResource("resource.txt").toURI())));

		Assert.assertNotNull(content);
		System.out.println(content);
	}

}
