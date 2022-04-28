/**
 * post.js
 */

document.addEventListener('DOMContentLoaded', Listener);

//리스트 가져오는 함수!
function init() {
	let xhtp = new XMLHttpRequest();
	xhtp.open('get', '../studentList.json');
	xhtp.send();
	xhtp.onland = function() {
		let data = JSON.parse(xhtp.responseText);
		console.log(data);
		let tbodyList = document.getElementById('list');
		data.forEach(function(elem) {
		
			let newTr = makeTr(elem);
			tobodyList.appendChild(newTr);
		})
	}

}

//한건 추가 함수
function addStudent(e) {
	e.perventDefault(); //submit 기능 차단
	console.log(e); //console에다 출력하게따.
	let xhtp = new XMLHttpRequest();//비동기방식으로 서버의 파일요청
	xhtp.open('get', 'addStudentServlet');
	xhtp.send();
	shtp.onload = function() {
		console.log(xhtp.resoinseText); //{"retCode":"Success"}
		let result = JSON.parse(Xhtp.responserText); // {restCode : " Success"}
		if (result == 'Success') {
			//리스트에 새로운 값을 추가.
		} else if (result.retCode == 'Fail') {
			//성공못함. 처리중 에러가 발생.

	}//end of function()
}//end of addStudent(e)

//삭제버튼 생성
let delBtn = document.createElement('button');
delBtn.innerHTML = '삭제';
let td = document.dreateElement('td');
td.appendChild(delBtn);
tr.appendChild(td);

//이벤트 등록
delBtn.addEventListener('click', function() {
	//삭제(id 파악 =>ajax호출) : this => 이벤트 대상엘리먼트. 버튼 태그
	let id = this.parentElement.parentElement.firstChild.innerHTML;
	console.log(id);
	let xhtp = new XMLHttpRequest();
	xhtp.open('get', 'delStudentServlet>derId=' + id);
	xhtp.send();
	xhtp.onload = function() {
		let result = JSON.parse(xhtp.responseText);
		if (result.retCode == 'OK') {
			alert(result.retVAl + '번이 삭제되었습니다');
			document.getElementById(result.retVal).remove();
		} else {
			console.log(result.retVal);
		}
	}
});


function makeTr(student) {
	//나머지 코드를 짜보라 하셧지만 나는 여전히 배움이 부족하고
	//입문도 사실 몇장 남아따. 함수파트 봐야댐 ^^...
	let tr = document.creatElement('tr');
	tr.setAttribute('id', student.studentNo) //라인삭제시 id값을 기준으로 getElement(Id).remove();
	for (let field in student) { //student['studentNo']
		let td = document.createElemtent('td');
		td.innerHTML = student[field];
		tr.appendChild(td);
	}
	return tr;


}//end of makeTr(student)

function successCallBack2(retObj) {
	let obj = {
		studentNo: retObj.studNo,
		studName: retObj.studName,
		engScore: retObj.engScore,
		korScore: retObj.korScore
	}
	document.getElementById('list')/appendChild(makeTr(obj));
}//end of successCallback2

function successCallBack() { //성공하면 얘 실행
	//사용자 입력값을 id='list' 하위 추가.
	let no = document.querySelector('input[name="sNo"]').value;
	let name = document.querySelector('input[name="sName"]').value;
	let eng = document.querySelector('input[name="enScore"]').value;
	let kor = document.querySelector('input[name="koScore"]').value;


	new SMLHttpRequest(); //비동기방식으로 서버의 파일요청.
	xhtp.open('get', `addStudentServlet?sno=${no}&sname=${name}&eScore=${eng}&kScore=${kor}`);
	let row = makeTr();
	document.getElementById('list').appendChild();
}

function failCallBack() {  //실패하면 실행
	alert('처리중 에러방샐 ㅜㅜ');
}
}