# UjStore - Android E-Commerce App

A modern Android e-commerce application built with **Jetpack Compose** and following **MVVM architecture pattern**. The app provides a seamless shopping experience with features like product browsing, cart management, and user profiles.

## 📱 Features

- **Product Catalog**: Browse a variety of shoes from popular brands (Adidas, Nike, Converse, Puma, etc.)
- **Product Details**: View detailed information about each shoe including price and description
- **Shopping Cart**: Add/remove items, adjust quantities, and manage your cart
- **Order Sharing**: Share order summaries via Android's native sharing functionality
- **User Profile**: Personal profile management
- **Bottom Navigation**: Easy navigation between Home, Cart, and Profile screens
- **Material Design 3**: Modern UI following Google's latest design guidelines

## 🏗️ Architecture

The app follows **MVVM (Model-View-ViewModel)** architecture pattern with the following components:

### Project Structure
```
src/main/java/com/zidan/ujStore/
├── data/
│   └── ShoesRepository.kt          # Data repository
├── di/
│   └── Injection.kt                # Dependency injection
├── main/
│   ├── common/
│   │   └── UiState.kt              # UI state management
│   ├── component/
│   │   ├── CartItem.kt             # Cart item component
│   │   ├── OrderButton.kt          # Order button component
│   │   ├── ProductCounter.kt       # Product counter component
│   │   └── ShoesItem.kt            # Shoes item component
│   ├── navigation/
│   │   ├── NavigationItem.kt       # Navigation items
│   │   └── Screen.kt               # Screen definitions
│   └── screen/
│       ├── cart/                   # Cart screen & ViewModel
│       ├── detail/                 # Product detail screen & ViewModel
│       ├── home/                   # Home screen & ViewModel
│       └── profile/                # Profile screen
├── model/
│   ├── FakeDataShoes.kt           # Sample data
│   ├── OrderShoes.kt              # Order model
│   └── Shoes.kt                   # Shoes model
├── ui/theme/                      # App theming
├── MainActivity.kt                # Main activity
├── ShoesApp.kt                   # Main app composable
└── ViewModelFactory.kt           # ViewModel factory
```

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM (Model-View-ViewModel)
- **Navigation**: Navigation Compose
- **State Management**: ViewModel + StateFlow
- **Dependency Injection**: Manual DI
- **Material Design**: Material 3
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 33 (Android 13)

## 📦 Dependencies

```gradle
// Core Android
implementation 'androidx.core:core-ktx:1.8.0'
implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.3.1'
implementation 'androidx.activity:activity-compose:1.5.1'

// Compose
implementation platform('androidx.compose:compose-bom:2022.10.00')
implementation 'androidx.compose.ui:ui'
implementation 'androidx.compose.ui:ui-graphics'
implementation 'androidx.compose.ui:ui-tooling-preview'
implementation 'androidx.compose.material3:material3'

// Architecture Components
implementation "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1"
implementation "androidx.navigation:navigation-compose:2.5.2"
```

## 🚀 Getting Started

### Prerequisites
- Android Studio Arctic Fox or later
- JDK 8 or higher
- Android SDK with API level 33

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/E-Commerce_App.git
   cd E-Commerce_App
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned repository and select it

3. **Build and Run**
   - Wait for Gradle sync to complete
   - Click the "Run" button or press `Shift + F10`
   - Select your target device/emulator

## 📸 Screenshots

![IMG-20250806-WA0001 1](https://github.com/user-attachments/assets/9f3d95ca-2542-4cb1-b2e1-0f6b0bb46f52)
![IMG-20250806-WA0003 1](https://github.com/user-attachments/assets/ce31d147-e548-4440-b351-f233a8118e5f)
![IMG-20250806-WA0004 1](https://github.com/user-attachments/assets/e29d44c1-7e12-42c6-92fa-c928afbd6200)
![IMG-20250806-WA0002 1](https://github.com/user-attachments/assets/009ea91b-7a26-453c-8b75-6262359a30d3)



## 🏪 Available Shoe Brands

The app features shoes from popular brands including:
- **Adidas** - Starting from Rp 600,000
- **Nike** - Premium collection at Rp 1,000,000
- **Converse** - Classic canvas shoes at Rp 1,000,000
- **Puma** - Futuristic designs at Rp 750,000
- **New Balance** - Innovative foam technology at Rp 1,000,000
- **Vans** - Classic skate shoes at Rp 300,000
- **Reebok** - Training shoes at Rp 750,000
- And more...

## 🔧 Key Features Implementation

### Navigation
- **Bottom Navigation Bar** with Home, Cart, and Profile tabs
- **Navigation Compose** for seamless screen transitions
- **Deep linking** support for product details

### State Management
- **UiState** sealed class for handling Loading, Success, and Error states
- **StateFlow** for reactive UI updates
- **ViewModel** for business logic separation

### Shopping Cart
- Add/remove products with quantity management
- Real-time total calculation
- Order sharing functionality

---

*Made with ❤️ for Android developers*
