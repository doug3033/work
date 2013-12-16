goog.provide("rokko.graphics.SequencedImage");

goog.require("rokko.graphics.Image");

/**
 *
 * @param {string} img
 * @param {Object} options
 * @constructor
 * @extends {rokko.graphics.Image}
 */
rokko.graphics.SequencedImage = function (img, options) {
   options = options || {};
   options.frames = options.frames || [];

   rokko.graphics.Image.call(/** @type {rokko.graphics.Image} */ (this), img, options.frames[0]);

   /** @type {number} */
   /** @protected */
   this.freq = options.freq;

   /** @type {number} */
   /** @protected */
   this.currFrame = options.currFrame || 0;

   /** @type {number} */
   /** @protected */
   this.lastTime = 0;

   /** @protected */
   this.frames = options.frames;

   /** @protected */
   /** @type {boolean} */
   this.loop = options.loop || true;
};
goog.inherits(rokko.graphics.SequencedImage, rokko.graphics.Image);

/**
 * @inheritDoc
 * @param {number} time
 * @returns {HTMLImageElement}
 */
rokko.graphics.SequencedImage.prototype.getElement = function (time) {
   if (time >= this.lastTime + (this.frames[this.currFrame].freq || this.freq)) {
      this.lastTime = time;
      this.currFrame = (this.currFrame + 1) % this.frames.length;
   }

   return this.img;
};

rokko.graphics.SequencedImage.prototype.getPos = function () {
   return this.frames[this.currFrame].pos;
};

rokko.graphics.SequencedImage.prototype.getSize = function () {
   return this.frames[this.currFrame].size;
};

rokko.graphics.SequencedImage.prototype.getFrame = function () {
   return this.currFrame;
};

/**
 * Set animation pointer to a particular keyframe. If the specified keyframe is out of bounds, set it to the first keyframe
 *
 * @param {number} keyFrame
 */
rokko.graphics.SequencedImage.prototype.setFrame = function (keyFrame) {
   this.currFrame = keyFrame < this.frames.length ? keyFrame : 0;
};

rokko.graphics.SequencedImage.prototype.resetFrame = function () {
   this.currFrame = 0;
};
