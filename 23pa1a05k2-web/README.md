# Simple Web Page Deployment via Docker

## 🎯 Project Aim
To create and deploy a simple web page using Docker that displays:
1. Student Roll Number
2. A custom welcome message
3. An auto-updating current date and time (JavaScript)

## 📁 Project Structure
- index.html: The HTML5 template containing CSS and JS logic.
- Dockerfile: Instructions for building the Nginx-based image.
- README.md: Project documentation.

---

## 🚀 Getting Started

### Prerequisites
- Docker Desktop installed
- A terminal (PowerShell or Bash)

### 🛠️ Local Build & Run
If you want to build the image yourself from this source code, run these commands in order:

1. Build the image:
  ```bash
   docker build -t mohith789p/devops:v2 .
  ```
3. Run the container (Mapping port 9090):
  ```bash
   docker run -d -p 9090:80 -e ROLL_NO="YOUR_ROLL_NUMBER" -e TITLE="Web Page Using Docker" -e WELCOME_MSG="WELCOME" --name lab_container mohith789p/devops:v2
  ```
---

## ⚙️ Environment Variables
This project uses Nginx Envsubst to inject variables at runtime. You do not need to edit the HTML file to change the roll number.

- ROLL_NO: Your student ID (e.g., 23PA1A05XX)
- TITLE: The card heading
- WELCOME_MSG: The sub-text message

---

### 🌐 Public Docker Image
The prebuilt image is available on Docker Hub:

**Repository:** [mohith789p/devops](https://hub.docker.com/repository/docker/mohith789p/devops)

**Pull Command:**
  ```bash
  docker pull mohith789p/devops:v2
  ```

---

## 🛠️ Technical Implementation
- Nginx Alpine: Lightweight base image.
- Envsubst: Automatically processes the index.html template.
- JavaScript: The clock updates every 1000ms using setInterval.

---

## 👨‍💻 Author
Mohith P | B.Tech CSE | Vishnu Institute of Technology (2023-2027)
