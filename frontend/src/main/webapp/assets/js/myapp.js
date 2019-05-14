$(function(){
	switch(menu)
	{
	case 'about':
		$('#about').addClass('active');
		break;
	case 'services':
		$('#services').addClass('active');
		break;
	case 'contact':
		$('#contact').addClass('active');
		break;
	case 'home':
		$('#home').addClass('active');
	default:
		$('#home').addClass('active');
	
	}
});