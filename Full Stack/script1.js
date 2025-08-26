function openModal(imageSrc) {
    const modal = document.getElementById('modal');
    const modalImage = document.getElementById('modalImage');
    modalImage.src = imageSrc;
    modal.classList.add('show');
}

function closeModal(event) {
    const modal = document.getElementById('modal');
    if (event.target === modal || event.target.classList.contains('close')) {
        modal.classList.remove('show');
    }
}