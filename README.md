# 🚦 RateLimitEngine-Java

<p align="center">
  <img src="https://img.shields.io/badge/Java-Backend-red?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/RateLimiter-System-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Sliding_Window-Algorithm-green?style=for-the-badge" />
</p>

---

## 💡 Overview

**RateLimitEngine-Java** is a lightweight backend simulation of a real-world API Rate Limiter used in large-scale systems like:
- APIs (Google, GitHub)
- Social media platforms
- Payment gateways

It controls how many requests a user can make within a specific time window using a **Sliding Window Algorithm**.

---

## ⚙️ Features

- 🚦 Per-user request limiting
- ⏱ Time-window based tracking
- 🧠 Sliding window algorithm implementation
- 📦 Queue-based request storage
- 💻 Console-based simulation (Scanner input supported)
- 🔥 Clean Java OOP structure

---

## 🧠 Core Concept

The system allows only **N requests per X seconds**.

Example: 
- Limit = 3 requests
- Window = 10 seconds


👉 If user exceeds limit → requests are BLOCKED  
👉 Old requests automatically expire with time

---

## 🏗️ Tech Stack

- Java (Core)
- Collections Framework (HashMap, Queue)
- OOP Design
- System Design Concept

---

## 🚀 How It Works

1. Each user request is timestamped
2. Stored in a Queue
3. Old timestamps (> window) are removed
4. If queue size < limit → ALLOW
5. Else → BLOCK

---



---

## 🧠 What I Learned

- Sliding window algorithm
- Real-world backend throttling logic
- Time-based data structures
- System design fundamentals

---

## 🚀 Future Improvements

- 🔥 Multi-threading support (Concurrency safe)
- 🌐 REST API version (Spring Boot)
- ⚡ Redis-based distributed rate limiter
- 📊 Dashboard for monitoring requests

---

## 💬 Why this project?

> "Not just a coding project — it's a simulation of real backend systems used in production APIs."

---

## 🤝 Connect

- GitHub: [RobinChahal0010](https://github.com/RobinChahal0010)

---

⭐ If you like this project, give it a star!
