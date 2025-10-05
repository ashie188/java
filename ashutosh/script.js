document.addEventListener("DOMContentLoaded", function() {
    // Sample news articles (can be replaced with real data fetched from an API)
    const articles = [
      { title: "Football: Messi scores hat-trick in comeback game", category: "Football", date: "2024-02-08", content: "Lorem ipsum dolor sit amet, consectetur adipiscing elit..." },
      { title: "NBA: Lakers defeat Nets in overtime thriller", category: "Basketball", date: "2024-02-08", content: "Lorem ipsum dolor sit amet, consectetur adipiscing elit..." },
      { title: "Australian Open: Serena Williams advances to quarterfinals", category: "Tennis", date: "2024-02-08", content: "Lorem ipsum dolor sit amet, consectetur adipiscing elit..." }
    ];
  
    // Function to display news articles
    function displayArticles() {
      const newsSection = document.getElementById("news");
      newsSection.innerHTML = "";
      articles.forEach(article => {
        const articleElement = document.createElement("article");
        articleElement.innerHTML = `
          <h2>${article.title}</h2>
          <p><strong>Category:</strong> ${article.category}</p>
          <p><strong>Date:</strong> ${article.date}</p>
          <p>${article.content}</p>
        `;
        newsSection.appendChild(articleElement);
      });
    }
  
    // Display initial articles
    displayArticles();
  });
  