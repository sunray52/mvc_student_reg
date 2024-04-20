/*
 * Copyright (c) 2019-2024. Luka Pavlov and others.
 * https://github.com/sunRay52/mvc_student_reg
 *
 * Licensed under the Apache License 2.0
 */

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