// scripts.js

// API URL
const API_URL = 'http://localhost:3000';

// Signup function
const signup = async () => {
  const username = document.getElementById('signupUsername').value;
  const password = document.getElementById('signupPassword').value;

  try {
    const response = await axios.post(`${API_URL}/signup`, { username, password });
    alert(response.data.message);
  } catch (error) {
    alert(error.response.data.message);
  }
};

// Login function
const login = async () => {
  const username = document.getElementById('loginUsername').value;
  const password = document.getElementById('loginPassword').value;

  try {
    const response = await axios.post(`${API_URL}/login`, { username, password });
    alert('Login successful!');
    localStorage.setItem('token', response.data.token);
  } catch (error) {
    alert(error.response.data.message);
  }
};

// Apply function
const apply = async () => {
  const token = localStorage.getItem('token');
  if (!token) {
    alert('Please login first');
    return;
  }

  const jobTitle = document.getElementById('jobTitle').value;
  const jobCompany = document.getElementById('jobCompany').value;
  const jobLocation = document.getElementById('jobLocation').value;
  const jobDescription = document.getElementById('jobDescription').value;

  try {
    const response = await axios.post(`${API_URL}/apply`, {
      jobTitle,
      company: jobCompany,
      location: jobLocation,
      description: jobDescription,
    }, {
      headers: {
        Authorization: token,
      },
    });
    alert(response.data.message);
  } catch (error) {
    alert('Failed to apply for job');
  }
};
