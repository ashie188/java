function getWeather() {
    const apiKey =api.openweathermap.org/data/2.5/forecast?id=524901&appid=; // Replace with your OpenWeatherMap API key
    const city = document.getElementById('cityInput').value.trim();
    const url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`;
  
    fetch(url)
      .then(response => {
        if (!response.ok) {
          throw new Error('City not found');
        }
        return response.json();
      })
      .then(data => {
        const weatherInfo = document.getElementById('weatherInfo');
        weatherInfo.innerHTML = `
          <h2>${data.name}, ${data.sys.country}</h2>
          <p>Temperature: ${data.main.temp}°C</p>
          <p>Description: ${data.weather[0].description}</p>
        `;
      })
      .catch(error => {
        const weatherInfo = document.getElementById('weatherInfo');
        weatherInfo.innerHTML = `<p>${error.message}</p>`;
      });
  }
  