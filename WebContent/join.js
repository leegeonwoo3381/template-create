function check_ok() {
		if (document.frm.name.value.length == 0) {
			alert("이름으로 입력하세요.");
			document.frm.name.focus();
			return false;
		}
		
		if (document.frm.jumin_1.value.length != 6) {
			alert("주민번호 앞자리는 6글자입니다.");
			document.frm.jumin_1.focus();
			return false;
		}
		
		if (document.frm.jumin_2.value.length != 7) {
			alert("주민번호 뒷자리는 7글자 입니다.");
			document.frm.jumin_2.focus();
			return false;			
		}
		
		if (document.frm.id.value.length == 0) {
			alert("아이디를 입력하세요.");
			document.frm.id.focus();
			return false;
		}
		
		if (document.frm.id.value.length < 4) {
			alert("아이디는 4글자이상 입니다.");
			document.frm.id.focus();
			return false;
		}		

		if (document.frm.pwd.value == "") {
			alert("비밀번호는 반드시 입력하세요.");
			document.frm.pwd.focus();
			return false;
		}
		
		if (document.frm.pwd.value != document.frm.pwd_re.value) {
			alert("비밀번호가 일치하지 않습니다.");
			document.frm.pwd_re.focus();
			return false;
		}

		return true;
	}