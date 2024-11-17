const movies = [
    { title: "Venom: El último baile", rating: "⭐ 7.7", genre: "Acción, Ciencia Ficción, Comedia, Fantasía.", duration: "120 min", img: "../img/venom.jpg" },
    { title: "Escape", rating: "⭐ 6.5", genre: "Thriller", duration: "129 min", img: "../img/esc.jpg" },
    { title: "La zona vacía", rating: "⭐ 8.0", genre: "Drama", duration: "107 min", img: "../img/lzv.jpg" },
    { title: "La Sustancia", rating: "⭐ 8.0", genre: "Drama, Terror", duration: "141 min", img: "../img/las.webp" },
    { title: "Gladiator II", rating: "⭐ 7.0", genre: "Drama histórico, Acción", duration: "150 min", img: "../img/gl2.jpg" },
    { title: "Padre no hay más que uno 4: Campanas de boda", rating: "⭐ 4.3", genre: "Comedia", duration: "90 min", img: "../img/p4.jpeg" },
    { title: "La Infiltrada", rating: "⭐ 7.5", genre: "Thriller", duration: "118 min", img: "../img/lai.webp" },
    { title: "Marco", rating: "⭐ 7.0", genre: "Drama, Thriller", duration: "101 min", img: "../img/m.webp" },
    { title: "Smile 2", rating: "⭐ 7.2", genre: "Terror, Thriller, Misterio", duration: "127 min", img: "../img/s2.webp" },
    { title: "Terrifier 3", rating: "⭐ 6.5", genre: "Terror", duration: "125 min", img: "../img/t3.webp" },
];

let loadedMovies = 0;
const initialLoadCount = 4;

function loadMovies(loadAll = false) {
    const movieGrid = document.getElementById('movieGrid');
    const count = loadAll ? movies.length : initialLoadCount;
    for (let i = loadedMovies; i < loadedMovies + count && i < movies.length; i++) {
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
    loadedMovies += count;
}

document.getElementById('loadMore').addEventListener('click', () => {
    loadMovies(true); 
    document.getElementById('loadMore').style.display = 'none';
});

document.addEventListener('DOMContentLoaded', () => {
    loadMovies();
    document.querySelectorAll('.movie-card').forEach((card, index) => {
        setTimeout(() => {
            card.style.opacity = '1';
            card.style.transform = 'translateY(0)';
        }, index * 100);
    });
});
