# 📧 Smart Email Assistant — Chrome Extension

A Chrome Extension that adds an **"Reply with AI"** button directly inside Gmail, allowing users to generate smart, tone-based email replies powered by the **Gemini API**.

---

## 🚀 Demo

> Open Gmail → Click **"Reply with AI"** → Select your tone → Get an AI-generated reply instantly!

---

## ✨ Features

- 🔘 **"Reply with AI" button** injected directly into Gmail's UI
- 🎭 **Tone Selection** — Choose from Formal, Friendly, Professional, and more
- ⚡ **Instant AI Reply** — Powered by Google's Gemini API
- 📋 **Auto-fill** — Generated reply is automatically placed in the Gmail compose box
- 🌐 **Published on Chrome Web Store**

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Frontend | React.js, Material UI (MUI) |
| HTTP Client | Axios |
| Backend | Spring Boot (Java) |
| AI Integration | Google Gemini API |
| Extension | Chrome Extension (Manifest V3) |

---

## 🏗️ Project Structure

```
smart-email-assistant/
│
├── backend/                  # Spring Boot Backend
│   ├── src/
│   │   └── main/java/
│   │       └── controller/   # REST API Controllers
│   │       └── service/      # Gemini API Integration
│   └── pom.xml
│
├── frontend/                 # React + MUI Frontend
│   ├── src/
│   │   ├── components/       # UI Components
│   │   └── App.jsx
│   └── package.json
│
├── extension/                # Chrome Extension
│   ├── manifest.json
│   ├── content.js            # Injects button into Gmail
│   └── popup.html
│
└── README.md
```

---

## ⚙️ How It Works

```
User clicks "Reply with AI" in Gmail
        ↓
Selects tone (Formal / Friendly / Professional)
        ↓
Chrome Extension reads email content from Gmail DOM
        ↓
Sends POST request to Spring Boot Backend (via Axios)
        ↓
Backend calls Gemini API with email + tone as prompt
        ↓
Gemini returns AI-generated reply
        ↓
Reply is auto-filled into Gmail's compose box
```

---

## 🔧 Setup & Installation

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/smart-email-assistant.git
cd smart-email-assistant
```

---

### 2. Backend Setup (Spring Boot)

```bash
cd backend
```

Add your Gemini API key in `application.properties`:

```properties
gemini.api.key=YOUR_GEMINI_API_KEY
```

Run the backend:

```bash
./mvnw spring-boot:run
```

Backend will start at `http://localhost:8080`

---

### 3. Frontend Setup (React)

```bash
cd frontend
npm install
npm start
```

---

### 4. Load Chrome Extension

1. Open Chrome and go to `chrome://extensions/`
2. Enable **Developer Mode** (top right toggle)
3. Click **"Load unpacked"**
4. Select the `/extension` folder
5. Open Gmail — you'll see the **"Reply with AI"** button!

---

## 🌐 Chrome Web Store

> ✅ This extension is published on the **Chrome Web Store**  
> 🔗 [Click here to install](#) *(add your link here)*

---

## 📸 Screenshots

> *(Add screenshots of the extension in Gmail here)*

---

## 🔑 Environment Variables

| Variable | Description |
|---|---|
| `gemini.api.key` | Your Google Gemini API Key |

> ⚠️ **Never expose your API key on the frontend.** It is stored securely on the backend only.

---

## 📚 What I Learned

- Building a **Spring Boot REST API** from scratch
- Integrating **Google Gemini API** for AI-powered responses
- Building a **Chrome Extension** with Manifest V3
- Working with **React.js** and **Material UI (MUI)**
- Connecting frontend and backend using **Axios**
- Publishing an extension on the **Chrome Web Store**

---

## 🔮 Future Improvements

- [ ] User authentication & personal API key support
- [ ] Reply history / saved replies feature
- [ ] Support for multiple languages
- [ ] More tone options (Apologetic, Urgent, Casual)
- [ ] Dark mode UI

---

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you'd like to change.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 👨‍💻 Author

**Your Name**  
📧 your.email@gmail.com  
🔗 [LinkedIn](https://linkedin.com/in/your-profile) | [GitHub](https://github.com/your-username)

---

> ⭐ If you found this project helpful, please give it a star!
