# Spring Boot Weather Application

## Overview

This Spring Boot application allows users to retrieve weather data by city name or zip code. The application integrates with the OpenWeatherMap API to fetch real-time weather information and uses Hibernate to persist the data to a local database. Additionally, Spring Scheduler is used to periodically refresh weather data from the OpenWeatherMap API.

## Features

- Retrieve weather data by city name or zip code
- Integration with OpenWeatherMap API
- Data persistence using Hibernate and a local database
- Periodic data refresh using Spring Scheduler

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven (for building and managing dependencies)
- OpenWeatherMap API key (sign up [here](https://openweathermap.org/) to obtain a free API key)

### Configuration

1. Clone the repository:

   ```bash
   git clone https://github.com/AsatryanA/ChatGPT-Task2-2.git
   ```

2. Navigate to the project directory:

   ```bash
    cd ChatGPT-Task2-2
    ```
 
3. Open the src/main/resources/application.properties file and add your OpenWeatherMap API key:

   ```bash
    openweathermap.api.key=your-api-key
    ```
   
4. Build the project:

   ```bash
    mvn clean install
    ```
   
5. Run the application:

   ```bash
    mvn spring-boot:run
    ```
   
6. Open a web browser and navigate to http://localhost:8080

## Usage

### Retrieve Weather Data

#### By City Name

1. Enter a city name in the search bar and click the "Search" button.
2. The application will display the current weather data for the specified city.
3. To view the weather data for the next 5 days, click the "5 Day Forecast" button.
4. To view the weather data for the next 16 days, click the "16 Day Forecast" button.
5. To view the weather data for the next 24 hours, click the "24 Hour Forecast" button.

#### By Zip Code

1. Enter a zip code in the search bar and click the "Search" button.
2. The application will display the current weather data for the specified zip code.
3. To view the weather data for the next 5 days, click the "5 Day Forecast" button.
4. To view the weather data for the next 16 days, click the "16 Day Forecast" button.
5. To view the weather data for the next 24 hours, click the "24 Hour Forecast" button.



## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
