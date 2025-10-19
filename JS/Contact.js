const formContact = document.getElementById("contact-form");

function submitForm(e) {
  e.preventDefault(); 

  console.log("Form submitted!");

  const inputName = document.getElementById("fullname");
  const inputEmail = document.getElementById("email");
  const inputMessage = document.getElementById("message");
  const inputGender = document.querySelector('input[name="gender"]:checked');
  const inputCity = document.getElementById("city");

 
  const hobbies = document.querySelectorAll('input[name="hobby"]:checked');
  let hobbyList = [];
  for (let i = 0; i < hobbies.length; i++) {
    hobbyList.push(hobbies[i].value);
  }


  console.log("Họ và tên:", inputName.value);
  console.log("Email:", inputEmail.value);
  console.log("Nội dung:", inputMessage.value);
  console.log("Giới tính:", inputGender ? inputGender.value : "Chưa chọn");
  console.log("Thành phố:", inputCity.value);
  console.log("Sở thích:", hobbyList.join(", "));
}

formContact.addEventListener("submit", submitForm);


