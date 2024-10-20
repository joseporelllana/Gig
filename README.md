# GigBook: Shows Your Shows
<img width="240" alt="image" src="https://github.com/user-attachments/assets/dc824677-a667-4376-8344-ac8152dce19b">


## Project Description

Version	Changes	Date
v1.0	Initial project outline.	
v1.1	Wireframes change & UI difference.

GigBook is an app dedicated to tracking all the concerts and live music users attend. Its purpose is to serve as a journal to document all the live music experiences users have. Users will be able to create their own GigBook with a unique name and customize it through color, themes, and layout. A GigBook will contain different entries for every concert. Each entry will include information such as:

- Tour Name
- Artist
- Venue

- Time
- Setlist
- Length

Additionally, users can rate each concert and add pictures and videos to concert entries.

The primary goal is to provide users with a unique, personalized archive of their concert experiences. Users will be able to connect with others who have similar tastes and understand each other based on the music they consume.

## Problem Addressing

Current concert goers have no way of documenting their concert experience and making that record completely theirs. The application will create a space where all that information is stored, organized, and protected. GigBook provides them with a platform to document the live music they attend and make it completely theirs.  

## Platform

The app will be built for Android Mobile devices. Kotlin/Java will be the programming language to build the application. The popularity of Android will result in a bigger customer base. 

## Front/Back-End Support

- **Backend**: Firebase will be used as the database service provider. It will manage user accounts, concert entries, and other  data.
- **Storage**: Google Cloud will be utilized for storing images and videos securely.

## Functionality

- Users will create their own unique GigBook with a custom name.
- Each GigBook will have a tagline and be searchable by its name.
- Users can track both past and future concerts.
- Concert entries can be shared via social media.
- Collaborative entries can be created with other users to document experiences together.

## Design (Wireframes)

![1](https://github.com/user-attachments/assets/7cacc506-cec6-41c1-922c-6fd964a0fcde)
![2](https://github.com/user-attachments/assets/9875a2d8-6c5f-484a-b197-43ecaa314715)
![3](https://github.com/user-attachments/assets/aa09a557-5a38-4187-a646-2bb6feb072fe)
![4](https://github.com/user-attachments/assets/6d16c3ed-3f8a-4391-904f-fb3a2b651d09)
![5](https://github.com/user-attachments/assets/861286bd-6282-4bbf-95db-25afa36fb86c)

## Project Update
An update to the GigBook’s UI is listed beside this, now when you click an entry the following design will be showcased. 

Here’s an arrangement for how the app will be built: 

app/ 

├── ui/ │


├── MainActivity.kt │ 


├── AuthActivity.kt │ 


├── CreateGigBookActivity.kt │ 


├── GigBookActivity.kt │ 


└── AddConcertActivity.kt 


├── models/ │ 


├── GigBook.kt 


│ └── ConcertEntry.kt 


├── utils/ 


│ └── FirestoreUtils.kt        

The menu has also been changed to be more user-friendly, it will utilize those recognizable icons to better fit the needs of the user. 
