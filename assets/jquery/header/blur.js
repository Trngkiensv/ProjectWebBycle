$('.item').hover(
    function() {
        $('.blur').css({
            'background-color': '#0000006e', // Thay #your-color bằng màu bạn muốn
            'transition': 'background-color 0.5s ease' // Thay đổi màu nền trong vòng 0.5 giây
        });
    }   , function() {
        $('.blur').css('background-color', ''); // Reset màu nền khi không hover
    }
);