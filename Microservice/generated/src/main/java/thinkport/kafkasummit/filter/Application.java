
package thinkport.kafkasummit.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;


@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Function<ArticleSold, ArticleSoldFiltered> filterArticleSold() {
		// Add business logic here.
		return ArticleSold -> {
			logger.info("Received ArticleSold:" + ArticleSold);
			return new ArticleSoldFiltered(ArticleSold.getArticleId(), ArticleSold.getArticleKey(), ArticleSold.getMarketId());
		};
	}

}
