$(function() {
	$('.js-decimal').maskMoney({ decimal: ',', thousands: '.' });
	$('.js-plain').maskMoney({ precision: 0, thousands: '.' });
})