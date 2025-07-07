# Real-Time Chat App

A real-time chat application built with Java 21 and Spring Boot 3.5.3. This project demonstrates WebSocket-based messaging with a modern frontend using Thymeleaf, Bootstrap, SockJS, and STOMP.js.

## Features

- Real-time messaging using WebSockets
- User-friendly UI with Bootstrap
- Live chat updates with SockJS and STOMP.js
- Server-side rendering with Thymeleaf
- Easy-to-understand codebase with Lombok

## Tech Stack

- **Java 21**
- **Spring Boot 3.5.3**
    - Spring Web
    - Spring WebSocket
    - Thymeleaf
    - Lombok
- **Frontend**
    - [Bootstrap](https://getbootstrap.com/docs/5.3/getting-started/introduction/#:~:text=Include%20Bootstrap%E2%80%99s%20CSS%20and%20JS)
    - [SockJS](https://github.com/sockjs/sockjs-client)
    - [STOMP.js](https://github.com/stomp-js/stompjs)

## Getting Started

### Prerequisites

- Java 21
- Gradle

### Running the Application

1. Clone the forked repository:
   ```sh
   git clone https://github.com/yourusername/real-time-chatapp.git
   cd real-time-chatapp
    ```
   
2. Build the project:
   ```sh
    ./gradlew build
    ```
   
3. Run the application:
   ```sh
   ./gradlew bootRun
   ```
   
4. Open your browser and navigate to `http://localhost:8080`.

### Testing the Application

You can test the application by opening multiple browser tabs or windows and sending messages in real-time. Each user will see messages from others instantly.

### Contributing
If you want to contribute to this project, feel free to fork the repository and submit a pull request. Contributions are welcome!

### License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.