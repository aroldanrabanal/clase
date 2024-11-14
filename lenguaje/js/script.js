const movies = [
    { title: "Película 1", rating: "⭐ 7.5", genre: "Acción", duration: "120 min", img: "../img/venom.jpg" },
    { title: "Película 2", rating: "⭐ 8.0", genre: "Drama", duration: "130 min", img: "poster2.jpg" },
    { title: "Película 2", rating: "⭐ 8.0", genre: "Drama", duration: "130 min", img: "poster2.jpg" },
    { title: "Película 2", rating: "⭐ 8.0", genre: "Drama", duration: "130 min", img: "poster2.jpg" },
    { title: "Película 2", rating: "⭐ 8.0", genre: "Drama", duration: "130 min", img: "poster2.jpg" },
    { title: "Película 2", rating: "⭐ 8.0", genre: "Drama", duration: "130 min", img: "poster2.jpg" },
    { title: "Película 2", rating: "⭐ 8.0", genre: "Drama", duration: "130 min", img: "poster2.jpg" },

];

let loadedMovies = 0;
const loadCount = 4;

function loadMovies() {
    const movieGrid = document.getElementById('movieGrid');
    for (let i = loadedMovies; i < loadedMovies + loadCount && i < movies.length; i++) {
        const movie = movies[i];
        const movieCard = document.createElement('div');
        movieCard.classList.add('movie-card');
        movieCard.innerHTML = `
            <img src="${movie.img}" alt="${movie.title}">
            <div class="movie-info">
                <h3 class="movie-title">${movie.title}</h3>
                <div class="movie-details">
                    <span>${movie.rating}</span>
                    <span>${movie.genre}</span>
                    <span>${movie.duration}</span>
                </div>
                <a href="#" class="view-details">Ver detalles</a>
            </div>
        `;
        movieGrid.appendChild(movieCard);
    }
    loadedMovies += loadCount;
}

document.getElementById('loadMore').addEventListener('click', () => {
    loadMovies();
    if (loadedMovies >= movies.length) {
        document.getElementById('loadMore').style.display = 'none';
    }
});

// Efecto fade-in al cargar
document.addEventListener('DOMContentLoaded', () => {
    loadMovies();
    document.querySelectorAll('.movie-card').forEach((card, index) => {
        setTimeout(() => {
            card.style.opacity = '1';
            card.style.transform = 'translateY(0)';
        }, index * 100);
    });
});
