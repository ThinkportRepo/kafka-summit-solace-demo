
package thinkport.kafkasummit.filter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArticleSoldFiltered {

	public ArticleSoldFiltered () {
	}
	public ArticleSoldFiltered (
		String articleId, 
		String articleKey, 
		String marketId) {
		this.articleId = articleId;
		this.articleKey = articleKey;
		this.marketId = marketId;
	}


	@JsonProperty("articleID")
	private String articleId;
	private String articleKey;
	@JsonProperty("marketID")
	private String marketId;

	public String getArticleId() {
		return articleId;
	}

	public ArticleSoldFiltered setArticleId(String articleId) {
		this.articleId = articleId;
		return this;
	}


	public String getArticleKey() {
		return articleKey;
	}

	public ArticleSoldFiltered setArticleKey(String articleKey) {
		this.articleKey = articleKey;
		return this;
	}


	public String getMarketId() {
		return marketId;
	}

	public ArticleSoldFiltered setMarketId(String marketId) {
		this.marketId = marketId;
		return this;
	}


	public String toString() {
		return "ArticleSoldFiltered ["
		+ " articleId: " + articleId
		+ " articleKey: " + articleKey
		+ " marketId: " + marketId
		+ " ]";
	}
}

