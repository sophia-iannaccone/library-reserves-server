This project is available remotely on https://library-reserves-server.herokuapp.com/
The first page available should be the Login page ('/login').
There are three users for this site: students, faculty, and librarians.

## Users
All users have the following parameters:
- id
- username: (lastname.first_letter_of_firstname)
- password: (role)
- firstName
- lastName
- role (student/faculty/librarian)
- courses

Login credentials the username paramter, and the password is the user's role (in all lowercase). Credentials of example users of each role are given below.

### Student
- Charlotte Bronte
  username: bronte.c
  password: student
  
- Claude Monet
  username: claude.m
  password: student
  
### Faculty
- Gary Oak
  username: oak.g
  password: faculty
  
### Librarian
- Melvil Dewey
  username: dewey.m
  password: librarian
  
## Header
The header appears at the top of every page. The home button on the far left will redirect the user to the login page ('/'). Next is a (currently non-functional) log-out button. On the far right is a (partially functional) search bar and search button. When the search button is clicked, a list of all books on reserve will be displayed. (Currently searches cannot be filtered based on the input of the search bar).

## Home Page
After loggin in, a series of buttons will be displayed. The buttons vary depending on the role of the user.
### Student
The student home page should display one button for each course the student is enrolled in. Clicking the course button will redirect to a page of books on reserve for that course.

### Faculty
The faculty home page should display one button for each course that is taught by that faculty member. Clicking the course button will redirect to a page of books on reserve for that course. A button at the bottom of the page will offer a reserve request form.

### Librarian
The librarian home page should display three buttons: "Submitted Reserve Requests", "All Courses", and "All Books on Reserve". The "Submitted Course Requests" button redirects to a list of completed reserve request forms awaiting approval; the "All Courses" button will redirect to a page displaying all courses available; and "All Books on Reserve" redirects to a page that displays all books on reserve at the library.

## Book List
### Student
Once a course button is clicked, the student is brought to a page that displays all books on reserve for that course. Clicking on the title of a book displays a modal that shows the book details as well as its availability. If the book is unavailable, it's due datetime is shown. (For prototyping purposes, every other book switches availability; the first book in the list is available, the second book is unavailable, etc.) Beneath the list of books is a suggestion that points out the search bar in the header.

### Faculty
Once a course button is clicked, the faculty member is brought to a page that displays all books on reserve for that course. Clicking on the title of a book displays a modal that shows the book details as well as its availability. If the book is unavailable, it's due datetime is shown. Beneath the list of books is a button that offers a reserve request form. When the button is clicked, a modal is displayed with input fields for the course information and the book information.

## Reserve Request Forms (Librarian Only)
Clicking on the "Submitted Reserve Requests" button on the homepage will bring a user with a "librarian" role to a page that lists the reserve request forms that have been submitted by faculty users. The list shows the name of the faculty user, the course they are submitting the request for, and the datetime the request was submitted. Clicking on the name and course title will redirect to a page that displays the course information and book information from the submitted form. At the bottom of the information is a button where the librarian user can submit the completed form.
