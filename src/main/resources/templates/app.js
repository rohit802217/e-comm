document.addEventListener('DOMContentLoaded', function() {
  const searchInput = document.getElementById('searchInput');
  const resultsContainer = document.getElementById('results');

  searchInput.addEventListener('input', function() {
    const query = searchInput.value.trim();

    if (query.length > 3) {
      fetchResults(query);
    } else {
      resultsContainer.innerHTML = ''; // Clear results if less than 4 characters
    }
  });

  function fetchResults(query) {
    fetch(`/api/search?q=${query}`)
      .then(response => response.json())
      .then(data => displayResults(data))
      .catch(error => console.error('Error fetching search results:', error));
  }

  function displayResults(items) {
    resultsContainer.innerHTML = '';

    if (items.length > 0) {
      items.forEach(item => {
        const itemElement = document.createElement('a');
        itemElement.href = '#';
        itemElement.className = 'list-group-item list-group-item-action';
        itemElement.innerHTML = `
          <h5 class="mb-1">${item.name}</h5>
          <p class="mb-1">${item.description}</p>
          <small class="text-success font-weight-bold">$${item.price}</small>
        `;
        resultsContainer.appendChild(itemElement);
      });
    } else {
      const noResults = document.createElement('p');
      noResults.className = 'text-muted';
      noResults.textContent = 'No results found.';
      resultsContainer.appendChild(noResults);
    }
  }
});
