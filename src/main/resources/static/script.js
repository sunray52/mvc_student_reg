let clickCount = 0

document.getElementById('checkList').addEventListener('click', () => {

    let glass = document.getElementById('glass')
    let secondBlock = document.getElementById('secondBlock')

    if (clickCount % 2 == 0) {
        glass.classList.add('glassActive');
        secondBlock.classList.add('secondBlockActive');
    } else {
        glass.classList.remove('glassActive');
        secondBlock.classList.remove('secondBlockActive');
    }

    clickCount++;
});