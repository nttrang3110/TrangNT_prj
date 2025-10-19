// Sở thích
const hobbies = ["Nghe nhạc", "Đi cafe", "Đọc sách"];
const hobbyList = document.getElementById("hobby-list");

let hobbyHTML = "";
for (const hobby of hobbies) {
  hobbyHTML += `<li>${hobby}</li>`;
}
hobbyList.innerHTML = hobbyHTML;


// Bảng học tập
const thongTinHocTap = [
  { monHoc: "Phiên dịch", diem: 8, xepLoai: "Khá" },
  { monHoc: "Biên dịch", diem: 8, xepLoai: "Khá" },
  { monHoc: "Tiếng Nhật IT", diem: 10, xepLoai: "Giỏi" },
];

const studyTable = document.getElementById("study-table");
let tableHTML = `
  <tr>
    <th>Môn học</th>
    <th>Điểm</th>
    <th>Xếp loại</th>
  </tr>
`;

for (const element of thongTinHocTap) {
  tableHTML += `
    <tr>
      <td>${element.monHoc}</td>
      <td>${element.diem}</td>
      <td>${element.xepLoai}</td>
    </tr>
  `;
}
studyTable.innerHTML = tableHTML;


// Kỹ năng
const kyNang = ["Tin học văn phòng", "Ngoại ngữ", "Làm việc nhóm"];
const skillList = document.getElementById("skill-list");

let skillHTML = "";
for (const skill of kyNang) {
  skillHTML += `<li>${skill}</li>`;
}
skillList.innerHTML = skillHTML;
