
package thinkport.kafkasummit.filter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArticleSold {

	public ArticleSold () {
	}
	public ArticleSold (
		String articleDetails, 
		String articleId, 
		String articleKey, 
		String marketId) {
		this.articleDetails = articleDetails;
		this.articleId = articleId;
		this.articleKey = articleKey;
		this.marketId = marketId;
	}


	private String articleDetails;
	@JsonProperty("articleID")
	private String articleId;
	private String articleKey;
	@JsonProperty("marketID")
	private String marketId;

	public String getArticleDetails() {
		return articleDetails;
	}

	public ArticleSold setArticleDetails(String articleDetails) {
		this.articleDetails = articleDetails;
		return this;
	}


	public String getArticleId() {
		return articleId;
	}

	public ArticleSold setArticleId(String articleId) {
		this.articleId = articleId;
		return this;
	}


	public String getArticleKey() {
		return articleKey;
	}

	public ArticleSold setArticleKey(String articleKey) {
		this.articleKey = articleKey;
		return this;
	}


	public String getMarketId() {
		return marketId;
	}

	public ArticleSold setMarketId(String marketId) {
		this.marketId = marketId;
		return this;
	}


	public String toString() {
		return "ArticleSold ["
		+ " articleDetails: " + articleDetails
		+ " articleId: " + articleId
		+ " articleKey: " + articleKey
		+ " marketId: " + marketId
		+ " ]";
	}
}

